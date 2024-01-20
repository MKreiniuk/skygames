package skytecgames.com.service;

import skytecgames.com.entities.Clan;
import skytecgames.com.entities.Task;
import skytecgames.com.exceptions.NoDataInDBException;
import skytecgames.com.model.ClanAddGoldDTO;
import skytecgames.com.model.ClanDTO;
import skytecgames.com.model.TaskComplitedDTO;

import skytecgames.com.repo.ClanRepository;
import skytecgames.com.repo.TaskRepository;

public class ClanService implements IClan {

    ClanRepository clanRepo;
    TaskRepository taskRepo;


    public ClanService(ClanRepository clanRepo, TaskRepository taskRepo) {
        this.clanRepo = clanRepo;
        this.taskRepo = taskRepo;
    }

    @Override
    public ClanDTO getClan(long id) {
        Clan clan= clanRepo.findById(id).orElseThrow(() -> new NoDataInDBException());
        ClanDTO res = new ClanDTO(clan.getId(), clan.getName(), clan.getGold());

        return res;
    }

    @Override
    public ClanAddGoldDTO addingGold(long id, int gold) {
        Clan temp = clanRepo.findById(id).orElseThrow(() -> new NoDataInDBException());
        int goldNew = temp.getGold()+ gold;
        temp.setGold(goldNew);
        try {
            clanRepo.save(temp);
        } catch (Exception e) {
           return new ClanAddGoldDTO(id, false);
        }


        return new ClanAddGoldDTO(id, true);
    }

    @Override
    public ClanAddGoldDTO addGoldByUser(long userId, long clanId, int gold) {
        /*вы реальном проекте необходимо реализовать repo users и сделать отдельные DTO для пополнения
        с учетом того, что это тестовое задание сделано допущение в этой части.
         */
        return addingGold(clanId, gold);
    }

    @Override
    public TaskComplitedDTO completeTask(long taskId, long id) {
        Task task = taskRepo.findById(taskId).orElseThrow(() -> new NoDataInDBException());
        int reward = task.getReward();

        return new TaskComplitedDTO(taskId, id,addingGold(id, reward).isAdded());
    }
}

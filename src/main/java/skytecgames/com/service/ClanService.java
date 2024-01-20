package skytecgames.com.service;

import skytecgames.com.entities.Clan;
import skytecgames.com.entities.Task;
import skytecgames.com.exceptions.NoDataInDBException;
import skytecgames.com.model.ClanAddGoldDTO;
import skytecgames.com.model.ClanDTO;
import skytecgames.com.model.TastComplitedDTO;
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
        return null;
    }

    @Override
    public TastComplitedDTO completeTask(long taskId, long id) {
        Task task = taskRepo.findById(taskId).orElseThrow(() -> new NoDataInDBException());
        Clan clan= clanRepo.findById(id).orElseThrow(() -> new NoDataInDBException());

        return null;
    }
}

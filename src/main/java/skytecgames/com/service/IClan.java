package skytecgames.com.service;

import skytecgames.com.model.ClanAddGoldDTO;
import skytecgames.com.model.ClanDTO;
import skytecgames.com.model.TaskComplitedDTO;


public interface IClan {
    ClanDTO getClan(long id);
    ClanAddGoldDTO addingGold(long id, int gold);

    TaskComplitedDTO completeTask(long taskId, long id);

}

package cn.iocoder.yudao.adminserver.modules.bpm.controller.task.vo.task;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TaskQueryReqVO {

    private String processKey;

    private String taskId;

    private String businessKey;
}

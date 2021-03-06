package com.qingchi.server.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author qinkaiyuan
 * @date 2019-05-26 21:19
 */
@Data
public class MessageQueryVO {
    private Long chatId;
    @NotNull
    private List<Long> msgIds;
}

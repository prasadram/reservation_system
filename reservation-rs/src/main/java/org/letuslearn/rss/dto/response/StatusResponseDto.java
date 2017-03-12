package org.letuslearn.rss.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by prasad on 11/3/17.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StatusResponseDto {


    private String status;

    private String projectName;

}

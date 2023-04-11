package googledrice.domain;

import googledrice.domain.*;
import googledrice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String viderUrl;
    private Long fileId;
    private String fileType;
}

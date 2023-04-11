package googledrice.domain;

import googledrice.domain.*;
import googledrice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private Long fileid;
    private String keyword;
    private String fileType;
}

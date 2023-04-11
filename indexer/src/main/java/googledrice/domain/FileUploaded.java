package googledrice.domain;

import googledrice.domain.*;
import googledrice.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String fileType;
    private Long userId;
}

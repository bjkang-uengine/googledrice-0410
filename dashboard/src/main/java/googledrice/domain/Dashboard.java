package googledrice.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Dashboard_table")
@Data
public class Dashboard {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long fileSize;
    private Long fileName;
    private Boolean idFileIndexed;
    private Boolean idFileUpoaded;
    private String videoUrl;
    private Long fileId;
}

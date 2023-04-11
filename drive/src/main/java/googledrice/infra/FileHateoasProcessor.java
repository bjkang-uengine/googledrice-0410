package googledrice.infra;

import googledrice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class FileHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<File>> {

    @Override
    public EntityModel<File> process(EntityModel<File> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/fileupload")
                .withRel("fileupload")
        );

        return model;
    }
}

package googledrice.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import googledrice.config.kafka.KafkaProcessor;
import googledrice.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    VideoRepository videoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Indexed'"
    )
    public void wheneverIndexed_ProcessVideo(@Payload Indexed indexed) {
        Indexed event = indexed;
        System.out.println(
            "\n\n##### listener ProcessVideo : " + indexed + "\n\n"
        );

        // Sample Logic //
        Video.processVideo(event);
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import sun.tools.jstat.OptionOutputFormatter;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest {

    @Test
    public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
        String text = null;

        System.out.println("Using orElseGet:");
        String defaultText =
                Optional.ofNullable(text).orElseGet(this::getMyDefault);
        Assertions.assertEquals("Default Value", defaultText);

        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text).orElse(getMyDefault());
        Assertions.assertEquals("Default Value", defaultText);
    }

    public String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }





}

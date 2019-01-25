package train;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Float.valueOf;

public class FaultData {

  public static void main(String[] args) throws JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm");

    mapper.setDateFormat(df);


    List<Float> integers = new ArrayList<>();
    integers.add(valueOf(12));
    integers.add(valueOf(34));

    List<Float> floats2 = new ArrayList<>();
    floats2.add(valueOf(24));
    floats2.add(valueOf(76));
    floats2.add(valueOf(36));
    floats2.add(valueOf(66));

    List<Float> floats3 = new ArrayList<>();
    floats3.add(valueOf(78));
    floats3.add(valueOf(99));
    floats3.add(valueOf(29));


    List<FaultDiagnastic> faultDiagnastics = Arrays.asList(
            new FaultDiagnastic(LocalDateTime.now(), integers),
            new FaultDiagnastic(LocalDateTime.now(), floats2),
            new FaultDiagnastic(LocalDateTime.now(), floats3)
            );

    TrainData data = new TrainData(1L,  faultDiagnastics);

    String value = mapper.writeValueAsString(data);

    System.out.println(value);
  }
}

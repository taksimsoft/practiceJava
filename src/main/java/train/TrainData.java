package train;

import com.sun.xml.internal.ws.developer.Serialization;

import java.util.ArrayList;
import java.util.List;

@Serialization
public class TrainData {
    Long    id;
    List<FaultDiagnastic> faultDiagnastics;

    public TrainData(Long id, List<FaultDiagnastic> faultDiagnastics) {
        this.id = id;
        this.faultDiagnastics = faultDiagnastics;
    }

    public Long getId() {
        return id;
    }

    public List<FaultDiagnastic> getFaultDiagnastics() {
        return faultDiagnastics;
    }
}


import java.time.*;

 public class ST500Info implements SensorTemperature {
   
        
            public int identifier() {
                return 2;
            }

            public Float temperature() {
                return (float)22;
            }

            public LocalDateTime getDateTime() {
                return LocalDateTime.now();
            }
            }
        
    

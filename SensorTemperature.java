

import java.time.LocalDateTime;

interface SensorTemperature{
	int identifier(); // идентификатор датчика
	Float temperature(); // температура датчика
	LocalDateTime getDateTime();		 
}
	
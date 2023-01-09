import java.time.*;
import java.util.Set;
public class DateTimeExample {
	public static void main(String[] args) {
		//1
		LocalDateTime ld1 = LocalDateTime.now();
		System.out.println(ld1);
		//2
		LocalDateTime ld2 = LocalDateTime.now().minusDays(7);
		System.out.println(ld2);
		//3		
		ZonedDateTime z3 = ZonedDateTime.now();
		System.out.println(z3);
		//4
		ZoneId zoneId = ZoneId.of("Africa/Nairobi");
		System.out.println(zoneId);
		//5
		ZonedDateTime zdt = ZonedDateTime.now(zoneId);
		System.out.println(zdt);
		//6
		Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(allZoneIds);

	}
}

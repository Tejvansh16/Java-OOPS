import java.time.*;
import java.util.Set;
public class DateTimeExample1 {

	public static void main(String[] args) {
		LocalDateTime ld1 = LocalDateTime.now();
		System.out.println(ld1);
		LocalDateTime ld2 = LocalDateTime.now().minusDays(7);
		System.out.println(ld2);
		ZonedDateTime z3 = ZonedDateTime.now();
		System.out.println(z3);
		ZoneId zoneId = ZoneId.of("Africa/Nairobi");
		System.out.println(zoneId);
	}

}

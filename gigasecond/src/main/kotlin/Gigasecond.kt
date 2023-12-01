import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(base: LocalDateTime) {
    constructor(base: LocalDate): this(base.atStartOfDay())

    val date: LocalDateTime = base.plusSeconds(1_000_000_000L)
}

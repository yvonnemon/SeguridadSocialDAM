import java.time.LocalDate;

public class Alta extends Contract {
    private LocalDate startDate;
    private Integer durationMonths;
    private LocalDate reportingDate;

    public Alta(Integer contractID,
                Integer quoteGroup,
                Integer workingType,
                String professionalCategory,
                Boolean altaBaja,
                LocalDate startDate,
                Integer durationMonths,
                LocalDate reportingDate) {
        super(contractID,
                quoteGroup,
                workingType,
                professionalCategory,
                altaBaja);
        this.startDate = startDate;
        this.durationMonths = durationMonths;
        this.reportingDate = reportingDate;
    }

    //Getters y Setters

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Integer getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(Integer durationMonths) {
        this.durationMonths = durationMonths;
    }

    public LocalDate getReportingDate() {
        return reportingDate;
    }

    public void setReportingDate(LocalDate reportingDate) {
        this.reportingDate = reportingDate;
    }
}

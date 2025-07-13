package sigma.server.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="plan_ppp")
public class PlanPPP {
    @Id
    @Column(name="\"Machine\"")
    private String transaction;

    @Column(name="\"Availability_of_PPP\"")
    private String availability;
    
    @Column(name = "\"Status_ppp\"")
    private String status;

    @Column(name = "\"Count_days_PPP\"")
    private Integer planPpp;
    @Column(name = "\"Date_start_PPP_Plan\"")
    private LocalDate planDateStart;

    @Column(name = "\"Date_start_PPP_Forecast\"")
    private LocalDate forecastDateStart;

    @Column(name = "\"Date_start_PPP_Fact\"")
    private LocalDate factDateStart;

    @Column(name = "\"Date_end_PPP_Plan\"")
    private LocalDate planDateStop;

    @Column(name = "\"Date_end_PPP_Forecast\"")
    private LocalDate forecastDateStop;

    @Column(name = "\"Date_end_PPP_Fact\"")
    private LocalDate factDateStop;

    @Column(name = "\"Shipping_date_Plan\"")
    private LocalDate planDateShipment;

    @Column(name = "\"Shipping_date_Forecast\"")
    private LocalDate forecastDateShipment;

    @Column(name = "\"Shipping_date_Fact\"")
    private LocalDate factDateShipment;
}

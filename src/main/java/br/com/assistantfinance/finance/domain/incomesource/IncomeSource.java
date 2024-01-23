package br.com.assistantfinance.finance.domain.incomesource;

import br.com.assistantfinance.finance.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity(name="income")
@Table(name="income")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class IncomeSource {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private BigDecimal salary;
    private BigDecimal investiment;
    private BigDecimal othersTypeIncome;
    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}

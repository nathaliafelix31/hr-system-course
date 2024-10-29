package br.com.felix.payrollapi.domain;

import lombok.*;


@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class User {


    private Long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;


}


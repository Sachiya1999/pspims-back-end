package com.al.exports.pspims.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BeverageProdOrder extends BaseEntity {

    // one bPO hv one pOD
    @OneToOne
    private ProdOrderDetails prodOrderDetails;
    // one bevType hv many bevPO
    @ManyToOne
    private BeverageType beverageType;
}

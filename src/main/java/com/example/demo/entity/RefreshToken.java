package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "REFRESH_TOKEN")
public class RefreshToken {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_REFRESH_TOKEN")
    @SequenceGenerator(name = "SQ_REFRESH_TOKEN", sequenceName = "SQ_REFRESH_TOKEN", allocationSize = 1)
    @Column(name = "id_token", columnDefinition = "NUMBER")
    private Long id;

    @Column(name = "token", columnDefinition = "varchar2(500)", nullable = false)
    private String token;

    @Column(name = "expiry_date", columnDefinition = "DATE", nullable = false)
    private Date expiryDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusuario", nullable = false)
    private Usuario usuario;
}

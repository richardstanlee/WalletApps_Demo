package org.bsim.intern.io.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "walletsTBL")
@SequenceGenerator(name = "seqwallets", initialValue = 100, allocationSize=10)
public class WalletsEntity implements Serializable {

    private static final long serialVersionUID= -7826514162523496264L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqwallets")
    private long id;

    @Column(nullable = false)
    private String walletId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private long balance;

    @Column(nullable = false)
    private String nohp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private UserEntity user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}

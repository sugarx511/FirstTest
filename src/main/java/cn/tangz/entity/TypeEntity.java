package cn.tangz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 属性
 *
 * @author: tz
 * @create: 2020-09-03
 **/
@Table(name = "T_TYPE")
@Entity
public class TypeEntity {

    /**
     * 属性id
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 属性名
     */
    @Column(name = "Name")
    private String name;

    /**
     * 父属性
     */
    @Column(name = "PARANT_ID")
    private String parantId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParantId() {
        return parantId;
    }

    public void setParantId(String parantId) {
        this.parantId = parantId;
    }
}

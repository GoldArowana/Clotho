package com.aries.auth.clotho.dal.po;


import javax.persistence.*;

@Table(name = "`user_role`")
public class UserRole {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`user_uid`")
    private Long userUid;

    @Column(name = "`role_id`")
    private Long roleId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return user_uid
     */
    public Long getUserUid() {
        return userUid;
    }

    /**
     * @param userUid
     */
    public void setUserUid(Long userUid) {
        this.userUid = userUid;
    }

    /**
     * @return role_id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
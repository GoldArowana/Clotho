package com.aries.auth.clotho.dal.po;

import javax.persistence.*;

@Table(name = "`role_authority`")
public class RoleAuthority {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`role_id`")
    private Long roleId;

    @Column(name = "`authority_id`")
    private Long authorityId;

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

    /**
     * @return authority_id
     */
    public Long getAuthorityId() {
        return authorityId;
    }

    /**
     * @param authorityId
     */
    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }
}
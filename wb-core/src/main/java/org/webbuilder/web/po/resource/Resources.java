package org.webbuilder.web.po.resource;

import org.webbuilder.utils.file.FileUtils;
import org.webbuilder.web.core.bean.GenericPo;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * 资源
 * Created by generator
 */
public class Resources extends GenericPo<String> {

    //主键
    @NotNull
    @NotEmpty(message = "id不能为空")
    private String u_id;

    //资源名称
    private String name;

    //资源地址
    private String path;

    //创建时间
    private java.util.Date create_date;

    //创建人主键
    private String creator_id;

    //MD5校验值
    private String md5;

    //资源类型
    private String type;

    //状态
    private int status;

    /**
     * 获取 主键
     *
     * @return String 主键
     */
    public String getU_id() {
        if (this.u_id == null)
            return "";
        return this.u_id;
    }

    /**
     * 设置 主键
     */
    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    /**
     * 获取 资源名称
     *
     * @return String 资源名称
     */
    public String getName() {
        if (this.name == null)
            return "";
        return this.name;
    }

    /**
     * 设置 资源名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 资源地址
     *
     * @return String 资源地址
     */
    public String getPath() {
        if (this.path == null)
            return "";
        return this.path;
    }

    /**
     * 设置 资源地址
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取 创建时间
     *
     * @return java.util.Date 创建时间
     */
    public java.util.Date getCreate_date() {
        return this.create_date;
    }

    /**
     * 设置 创建时间
     */
    public void setCreate_date(java.util.Date create_date) {
        this.create_date = create_date;
    }

    /**
     * 获取 创建人主键
     *
     * @return String 创建人主键
     */
    public String getCreator_id() {
        if (this.creator_id == null)
            return "";
        return this.creator_id;
    }

    /**
     * 设置 创建人主键
     */
    public void setCreator_id(String creator_id) {
        this.creator_id = creator_id;
    }

    /**
     * 获取 MD5校验值
     *
     * @return String MD5校验值
     */
    public String getMd5() {
        if (this.md5 == null)
            return "";
        return this.md5;
    }

    /**
     * 设置 MD5校验值
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * 获取 资源类型
     *
     * @return String 资源类型
     */
    public String getType() {
        if (this.type == null)
            return "";
        return this.type;
    }

    /**
     * 设置 资源类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取 状态
     *
     * @return int 状态
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * 设置 状态
     */
    public void setStatus(int status) {
        this.status = status;
    }

    public String getSuffix() {
        return FileUtils.getSuffix(getName());
    }

}

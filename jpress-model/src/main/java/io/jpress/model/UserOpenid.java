package io.jpress.model;

import io.jboot.db.annotation.Table;
import io.jpress.model.base.BaseUserOpenid;

/**
 * Generated by JPress.
 */
@Table(tableName = "user_openid", primaryKey = "id")
public class UserOpenid extends BaseUserOpenid<UserOpenid> {

    private static final long serialVersionUID = 1L;

    /**
     * 微信
     */
    public static final String TYPE_WECHAT = "wechat";

    /**
     * 微信的 unionid
     */
    public static final String TYPE_WECHAT_UNIONID = "wechat_unionid";

    /**
     * QQ
     */
    public static final String TYPE_QQ = "qq";

    /**
     * QQ的 unionid
     */
    public static final String TYPE_QQ_UNIONID = "qq_unionid";

    /**
     * 钉钉
     */
    public static final String TYPE_DINGDING = "dingding";

    /**
     * 微博
     */
    public static final String TYPE_WEIBO = "weibo";
    /**
     * github
     */
    public static final String TYPE_GITHUB = "github";
    /**
     * 码云
     */
    public static final String TYPE_GITEE = "gitee";

    public UserOpenid() {
    }
}

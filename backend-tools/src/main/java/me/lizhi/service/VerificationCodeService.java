package me.lizhi.service;

import me.lizhi.domain.VerificationCode;
import me.lizhi.domain.vo.EmailVo;

/**
 *
 */
public interface VerificationCodeService {

    /**
     * 发送邮件验证码
     * @param code
     */
    EmailVo sendEmail(VerificationCode code);

    /**
     * 验证
     * @param code
     */
    void validated(VerificationCode code);
}

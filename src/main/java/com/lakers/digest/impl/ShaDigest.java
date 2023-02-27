package com.lakers.digest.impl;

import com.lakers.digest.Digest;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created on 2023/2/27 11:03
 *
 * @author lakers
 */
@Component
public class Md5Digest implements Digest {

    private final Logger log = LoggerFactory.getLogger(Md5Digest.class);
    @Override
    public String digest(String raw) {
        log.info("使用MD5算法生成摘要");
        return DigestUtils.md5Hex(raw);
    }
}

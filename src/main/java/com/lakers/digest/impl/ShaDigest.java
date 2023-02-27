package com.lakers.digest.impl;

import com.lakers.digest.Digest;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2023/2/27 11:03
 *
 * @author lakers
 */
public class ShaDigest implements Digest {

    private final Logger log = LoggerFactory.getLogger(ShaDigest.class);

    @Override
    public String digest(String raw) {
        log.info("使用SHA算法生成摘要");
        return DigestUtils.sha256Hex(raw);
    }
}

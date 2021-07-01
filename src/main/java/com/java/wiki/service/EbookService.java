package com.java.wiki.service;

import com.java.wiki.domain.Ebook;
import com.java.wiki.domain.EbookExample;
import com.java.wiki.mapper.EbookMapper;
import com.java.wiki.req.EbookReq;
import com.java.wiki.resp.EbookResp;
import com.java.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");//模糊查询
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> resplist = CopyUtil.copyList(ebookList,EbookResp.class);

        return resplist;
    }
}

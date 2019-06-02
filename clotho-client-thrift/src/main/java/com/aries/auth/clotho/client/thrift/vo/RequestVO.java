package com.aries.auth.clotho.client.thrift.vo;

import com.aries.auth.clotho.idl.thrift.dto.RequestDTO;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RequestVO {
    private long userId;
    private String url;

    public long getUserId() {
        return userId;
    }

    public String getUrl() {
        return url;
    }


    public static final class RequestVOBuilder {
        private long userId;
        private String url;

        private RequestVOBuilder() {
        }

        public static RequestVOBuilder aRequestVO() {
            return new RequestVOBuilder();
        }

        public RequestVOBuilder userId(long userId) {
            this.userId = userId;
            return this;
        }

        public RequestVOBuilder url(String url) {
            this.url = url;
            return this;
        }

        public RequestVO build() {
            RequestVO requestVO = new RequestVO();
            requestVO.userId = this.userId;
            requestVO.url = this.url;
            return requestVO;
        }
    }

    public static RequestDTO toDTO(RequestVO requestVO) {
        RequestDTO requestDTO = new RequestDTO();
        requestDTO.setUserId(requestVO.getUserId());
        requestDTO.setUrl(requestVO.getUrl());
        return requestDTO;
    }

    public static RequestVO buildFromDTO(RequestDTO requestDTO) {
        RequestVO requestVO = new RequestVO();
        requestDTO.userId = requestVO.userId;
        requestDTO.url = requestVO.url;
        return requestVO;
    }

    public static List<RequestVO> buildFromDTO(List<RequestDTO> requestDTOList) {
        if (CollectionUtils.isEmpty(requestDTOList)) {
            return Collections.emptyList();
        }
        return requestDTOList.stream().map(RequestVO::buildFromDTO).collect(Collectors.toList());
    }

}

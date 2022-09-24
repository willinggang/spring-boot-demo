package com.willing.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Szg
 * @ClassName:
 * @Description:
 * @date 2022/9/2316:08
 */
@FeignClient(name = "kamelnet-buyerwallet-airwallex", path = "", contextId = "GlobalAccountFeign")
public interface MyClient {
    @GetMapping({"/globalaccount/manage/query"})
    String query(@RequestParam("id") String var1, @RequestParam(value = "xOnBehalfOf",defaultValue = "") String var2);

}

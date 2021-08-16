package cn.dmego.sofarpc.run.controller;

import cn.dmego.sofarpc.service.ConsumerService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dmego
 * @date 2021/08/11 15:38
 */
@RestController
public class HelloController {

    @SofaReference(interfaceType = ConsumerService.class, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private ConsumerService consumerService;

    @GetMapping("/hello/{str}")
    public String helloSofaRpc(@PathVariable("str") String str){
        return consumerService.invokeProvider(str);
    }

}

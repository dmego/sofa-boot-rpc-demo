package cn.dmego.sofarpc.consumer.service;

import cn.dmego.sofarpc.service.ConsumerService;
import cn.dmego.sofarpc.service.ProviderService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dmego
 * @date 2021/08/11 14:25
 */
@SofaService(interfaceType = ConsumerService.class, bindings = { @SofaServiceBinding(bindingType = "bolt") })
@Service("consumerService")
public class ConsumerServiceImpl implements ConsumerService {

    @SofaReference(interfaceType = ProviderService.class, binding = @SofaReferenceBinding(bindingType = "bolt"))
    private ProviderService providerService;

    @Override
    public String invokeProvider(String string) {
        System.out.println("======= ConsumerService invokeProvider invoke: " + string);
        String sayProvider = providerService.sayProvider(string);
        return "invokeProvider response :(" + sayProvider +")!";
    }
}

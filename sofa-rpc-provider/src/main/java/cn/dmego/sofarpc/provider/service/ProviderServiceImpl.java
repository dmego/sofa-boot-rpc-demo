package cn.dmego.sofarpc.provider.service;

import cn.dmego.sofarpc.service.ProviderService;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import org.springframework.stereotype.Service;

/**
 * @author dmego
 * @date 2021/08/11 14:24
 */
@SofaService(interfaceType = ProviderService.class, bindings = { @SofaServiceBinding(bindingType = "bolt") })
@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String sayProvider(String string) {
        System.out.println("======= providerService sayProvider invoke: " + string);
        return "sayProvider" + string + "!";
    }
}

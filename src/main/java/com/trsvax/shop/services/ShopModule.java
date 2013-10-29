package com.trsvax.shop.services;

import java.util.Map;

import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.services.StrategyBuilder;
import org.apache.tapestry5.ioc.util.StrategyRegistry;
import org.apache.tapestry5.services.LibraryMapping;

import com.trsvax.shop.PaymentSource;

public class ShopModule {
	
	public static PaymentSource buildPaymentSource(Map<Class,PaymentSource> configuration, StrategyBuilder strategyBuilder) {
		
		StrategyRegistry<PaymentSource> registry = StrategyRegistry.newInstance(PaymentSource.class, configuration);
		
		return strategyBuilder.build(registry);
	}
	
	public static void contributeComponentClassResolver(Configuration<LibraryMapping> configuration) {
		configuration.add(new LibraryMapping("shop", "com.trsvax.shop"));
	}

}

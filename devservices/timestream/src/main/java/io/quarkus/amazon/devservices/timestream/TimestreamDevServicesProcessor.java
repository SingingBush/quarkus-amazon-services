package io.quarkus.amazon.devservices.timestream;

import io.quarkus.amazon.common.deployment.spi.AbstractDevServicesLocalStackProcessor;
import io.quarkus.amazon.common.deployment.spi.DevServicesLocalStackProviderBuildItem;
import io.quarkus.amazon.timestream.runtime.TimestreamBuildTimeConfig;
import io.quarkus.deployment.annotations.BuildStep;

public class TimestreamDevServicesProcessor extends AbstractDevServicesLocalStackProcessor {

    @BuildStep
    DevServicesLocalStackProviderBuildItem setupTimestream(TimestreamBuildTimeConfig clientBuildTimeConfig) {
        return null; // todo: this.setup(Service.TIMESTREAM, clientBuildTimeConfig.devservices);
    }
}

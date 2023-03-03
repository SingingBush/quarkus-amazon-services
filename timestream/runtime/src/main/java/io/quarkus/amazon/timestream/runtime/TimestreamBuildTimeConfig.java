package io.quarkus.amazon.timestream.runtime;

import io.quarkus.amazon.common.runtime.DevServicesBuildTimeConfig;
import io.quarkus.amazon.common.runtime.SdkBuildTimeConfig;
import io.quarkus.amazon.common.runtime.SyncHttpClientBuildTimeConfig;
import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

/**
 * Amazon Timestream build time configuration
 */
@ConfigRoot(name = "timestream", phase = ConfigPhase.BUILD_AND_RUN_TIME_FIXED)
public class TimestreamBuildTimeConfig {

    /**
     * SDK client configurations for AWS SQS client
     */
    @ConfigItem(name = ConfigItem.PARENT)
    public SdkBuildTimeConfig sdk;

    /**
     * Sync HTTP transport configuration for Amazon SQS client
     */
    @ConfigItem
    public SyncHttpClientBuildTimeConfig syncClient;

    /**
     * Config for dev services
     */
    @ConfigItem
    public DevServicesBuildTimeConfig devservices;
}

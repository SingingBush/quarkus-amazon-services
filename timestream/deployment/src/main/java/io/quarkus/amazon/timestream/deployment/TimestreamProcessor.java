package io.quarkus.amazon.timestream.deployment;

import org.jboss.jandex.DotName;

import io.quarkus.amazon.common.deployment.AbstractAmazonServiceProcessor;
import io.quarkus.amazon.timestream.runtime.TimestreamBuildTimeConfig;

// todo: finish this class
public class TimestreamProcessor extends AbstractAmazonServiceProcessor {

    private static final String AMAZON_TIMESTREAM = "amazon-timestream";

    TimestreamBuildTimeConfig buildTimeConfig;

    @Override
    protected String amazonServiceClientName() {
        return AMAZON_TIMESTREAM;
    }

    @Override
    protected String configName() {
        return "timestream";
    }

    @Override
    protected DotName syncClientName() {
        return null;
    }

    @Override
    protected DotName asyncClientName() {
        return null;
    }

    @Override
    protected String builtinInterceptorsPath() {
        return null;
    }
}

package io.holunda.commons.immutables;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.holunda.commons.immutables.CamundaImmutables.ImmutablesConfiguration.CamundaPojoStyle;
import org.camunda.bpm.engine.runtime.Execution;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.impl.VariableMapImpl;
import org.immutables.value.Value;
import org.immutables.value.Value.Default;
import org.jetbrains.annotations.Nullable;

@Value.Immutable
@CamundaPojoStyle
@JsonDeserialize(as = ImmutableProcessInstance.class)
@JsonSerialize(as = ImmutableProcessInstance.class)
public interface _ProcessInstance extends ProcessInstanceWithVariables, Execution {

  @Default
  @Override
  default String getProcessInstanceId() {
    return getId();
  }

  @Nullable
  @Override
  String getRootProcessInstanceId();

  @Override
  @Default
  @JsonSerialize(as = VariableMapImpl.class)
  @JsonDeserialize(as = VariableMapImpl.class)
  default VariableMap getVariables() {
    return Variables.createVariables();
  }

  @Override
  @Nullable
  String getCaseInstanceId();

  @Nullable
  @Override
  String getBusinessKey();

  @Nullable
  @Override
  String getTenantId();

  @Default
  @Override
  default boolean isSuspended() {
    return false;
  }

  @Default
  @Override
  default boolean isEnded() {
    return false;
  }
}
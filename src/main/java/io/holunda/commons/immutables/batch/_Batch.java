package io.holunda.commons.immutables.batch;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.holunda.commons.immutables._config.CamundaPojoStyle;
import org.camunda.bpm.engine.batch.Batch;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

/**
 * @see io.holunda.commons.immutables.CamundaImmutables#batch(Batch)
 */
@Value.Immutable
@CamundaPojoStyle
@JsonDeserialize(as = ImmutableBatch.class)
@JsonSerialize(as = ImmutableBatch.class)
@SuppressWarnings("java:S114")
interface _Batch extends Batch {

  @Override
  String getId();

  @Override
  String getType();

  @Override
  int getTotalJobs();

  @Override
  int getJobsCreated();

  @Override
  int getBatchJobsPerSeed();

  @Override
  int getInvocationsPerBatchJob();

  @Override
  String getSeedJobDefinitionId();

  @Override
  String getMonitorJobDefinitionId();

  @Override
  String getBatchJobDefinitionId();

  @Override
  @Nullable
  String getCreateUserId();

  @Nullable
  @Override
  String getTenantId();

  @Override
  default boolean isSuspended() {
    return false;
  }

  @Nullable
  @Override
  Date getStartTime();

  @Nullable
  @Override
  Date getExecutionStartTime();
}

package io.holunda.commons.immutables;

import io.holunda.commons.immutables.batch.ImmutableBatch;
import io.holunda.commons.immutables.externaltask.ImmutableExternalTask;
import io.holunda.commons.immutables.externaltask.ImmutableLockedExternalTask;
import io.holunda.commons.immutables.form.ImmutableFormRef;
import io.holunda.commons.immutables.history.ImmutableHistoricDecisionEvaluationEvent;
import io.holunda.commons.immutables.identity.ImmutableGroup;
import io.holunda.commons.immutables.identity.ImmutableTenant;
import io.holunda.commons.immutables.identity.ImmutableUser;
import io.holunda.commons.immutables.management.ImmutableJobDefinition;
import io.holunda.commons.immutables.repository.ImmutableCaseDefinition;
import io.holunda.commons.immutables.repository.ImmutableDecisionDefinition;
import io.holunda.commons.immutables.repository.ImmutableDecisionRequirementsDefinition;
import io.holunda.commons.immutables.repository.ImmutableDeployment;
import io.holunda.commons.immutables.repository.ImmutableProcessDefinition;
import io.holunda.commons.immutables.repository.ImmutableResource;
import io.holunda.commons.immutables.repository.ImmutableResourceDefinition;
import io.holunda.commons.immutables.runtime.ImmutableActivityInstance;
import io.holunda.commons.immutables.runtime.ImmutableCaseExecution;
import io.holunda.commons.immutables.runtime.ImmutableCaseInstance;
import io.holunda.commons.immutables.runtime.ImmutableEventSubscription;
import io.holunda.commons.immutables.runtime.ImmutableExecution;
import io.holunda.commons.immutables.runtime.ImmutableIncident;
import io.holunda.commons.immutables.runtime.ImmutableJob;
import io.holunda.commons.immutables.runtime.ImmutableProcessElementInstance;
import io.holunda.commons.immutables.runtime.ImmutableProcessInstance;
import io.holunda.commons.immutables.runtime.ImmutableVariableInstance;
import io.holunda.commons.immutables.task.ImmutableAttachment;
import io.holunda.commons.immutables.task.ImmutableComment;
import io.holunda.commons.immutables.task.ImmutableIdentityLink;
import io.holunda.commons.immutables.task.ImmutableTask;
import org.camunda.bpm.engine.batch.Batch;
import org.camunda.bpm.engine.externaltask.ExternalTask;
import org.camunda.bpm.engine.externaltask.LockedExternalTask;
import org.camunda.bpm.engine.form.CamundaFormRef;
import org.camunda.bpm.engine.identity.Group;
import org.camunda.bpm.engine.identity.Tenant;
import org.camunda.bpm.engine.identity.User;
import org.camunda.bpm.engine.impl.history.event.HistoricDecisionEvaluationEvent;
import org.camunda.bpm.engine.management.JobDefinition;
import org.camunda.bpm.engine.repository.CaseDefinition;
import org.camunda.bpm.engine.repository.DecisionDefinition;
import org.camunda.bpm.engine.repository.DecisionRequirementsDefinition;
import org.camunda.bpm.engine.repository.Deployment;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.repository.Resource;
import org.camunda.bpm.engine.repository.ResourceDefinition;
import org.camunda.bpm.engine.runtime.ActivityInstance;
import org.camunda.bpm.engine.runtime.CaseExecution;
import org.camunda.bpm.engine.runtime.CaseInstance;
import org.camunda.bpm.engine.runtime.EventSubscription;
import org.camunda.bpm.engine.runtime.Execution;
import org.camunda.bpm.engine.runtime.Incident;
import org.camunda.bpm.engine.runtime.Job;
import org.camunda.bpm.engine.runtime.ProcessElementInstance;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.runtime.ProcessInstanceWithVariables;
import org.camunda.bpm.engine.runtime.VariableInstance;
import org.camunda.bpm.engine.task.Attachment;
import org.camunda.bpm.engine.task.Comment;
import org.camunda.bpm.engine.task.IdentityLink;
import org.camunda.bpm.engine.task.Task;

import java.util.Optional;

public final class CamundaImmutables {
  public static final long VERSION = 7140L;

  public static final UnsupportedOperationException UNMODIFIABLE = new UnsupportedOperationException("field is unmodifiable");

  public static ImmutableActivityInstance activityInstance(final ActivityInstance activityInstance) {
    return ImmutableActivityInstance.builder().from(activityInstance).build();
  }

  public static ImmutableAttachment attachment(Attachment attachment) {
    return ImmutableAttachment.builder().from(attachment).build();
  }

  public static ImmutableBatch batch(Batch batch) {
    return ImmutableBatch.builder().from(batch).build();
  }

  public static ImmutableCaseDefinition caseDefinition(final CaseDefinition caseDefinition) {
    return ImmutableCaseDefinition.builder().from(caseDefinition).build();
  }

  public static ImmutableCaseExecution caseExecution(final CaseExecution caseExecution) {
    return ImmutableCaseExecution.builder().from(caseExecution).build();
  }

  public static ImmutableCaseInstance caseInstance(final CaseInstance caseInstance) {
    return ImmutableCaseInstance.builder().from(caseInstance).build();
  }

  public static ImmutableComment comment(Comment comment) {
    return ImmutableComment.builder().from(comment).build();
  }

  public static ImmutableDecisionDefinition decisionDefinition(final DecisionDefinition decisionDefinition) {
    return ImmutableDecisionDefinition.builder().from(decisionDefinition).build();
  }

  public static ImmutableDecisionRequirementsDefinition decisionRequirementsDefinition(final DecisionRequirementsDefinition decisionRequirementsDefinition) {
    return ImmutableDecisionRequirementsDefinition.builder().from(decisionRequirementsDefinition).build();
  }

  public static ImmutableDeployment deployment(Deployment deployment) {
    return ImmutableDeployment.builder().from(deployment).build();
  }

  public static ImmutableEventSubscription eventSubscription(final EventSubscription eventSubscription) {
    return ImmutableEventSubscription.builder().from(eventSubscription).build();
  }

  public static ImmutableExecution execution(final Execution execution) {
    return ImmutableExecution.builder().from(execution).build();
  }

  public static ImmutableExternalTask externalTask(ExternalTask externalTask) {
    return ImmutableExternalTask.builder().from(externalTask).build();
  }

  public static ImmutableFormRef formRef(CamundaFormRef formRef) {
    return ImmutableFormRef.builder().from(formRef).build();
  }

  public static ImmutableLockedExternalTask lockedExternalTask(LockedExternalTask externalTask) {
    return ImmutableLockedExternalTask.builder().from(externalTask).build();
  }

  public static ImmutableGroup group(final Group group) {
    return ImmutableGroup.builder().from(group).build();
  }

  public static ImmutableHistoricDecisionEvaluationEvent historicDecisionEvaluationEvent(final HistoricDecisionEvaluationEvent event) {
    return ImmutableHistoricDecisionEvaluationEvent.builder().from(event)
      .build();
  }

  public static ImmutableIdentityLink identityLink(final IdentityLink identityLink) {
    return ImmutableIdentityLink.builder().from(identityLink).build();
  }

  public static ImmutableIncident incident(final Incident incident) {
    return ImmutableIncident.builder().from(incident).build();
  }

  public static ImmutableJob job(final Job job) {
    return ImmutableJob.builder().from(job).build();
  }

  public static ImmutableJobDefinition jobDefinition(final JobDefinition jobDefinition) {
    return ImmutableJobDefinition.builder().from(jobDefinition).build();
  }

  public static ImmutableProcessDefinition processDefinition(ProcessDefinition processDefinition) {
    return ImmutableProcessDefinition.builder().from(processDefinition).build();
  }

  public static ImmutableProcessElementInstance processElementInstance(final ProcessElementInstance processElementInstance) {
    return ImmutableProcessElementInstance.builder().from(processElementInstance).build();
  }

  public static ImmutableProcessInstance processInstance(final ProcessInstanceWithVariables processInstance) {
    return ImmutableProcessInstance.builder().from(processInstance).build();
  }

  public static ImmutableProcessInstance processInstance(final ProcessInstance processInstance) {
    return ImmutableProcessInstance.builder().from(processInstance).build();
  }

  public static ImmutableResource resource(Resource resource) {
    return ImmutableResource.builder().from(resource).build();
  }

  public static ImmutableResourceDefinition resourceDefinition(final ResourceDefinition resourceDefinition) {
    return ImmutableResourceDefinition.builder().from(resourceDefinition).build();
  }

  public static ImmutableTask task(final Task task) {
    final ImmutableFormRef immutableFormRef = Optional.ofNullable(task.getCamundaFormRef()).map(CamundaImmutables::formRef).orElse(null);
    return ImmutableTask.builder().from(task)
      .camundaFormRef(immutableFormRef)
      .build();
  }

  public static ImmutableTenant tenant(final Tenant tenant) {
    return ImmutableTenant.builder().from(tenant).build();
  }

  public static ImmutableUser user(final User user) {
    return ImmutableUser.builder().from(user).build();
  }

  public static ImmutableVariableInstance variableInstance(VariableInstance variableInstance) {
    return ImmutableVariableInstance.builder().from(variableInstance).build();
  }

  private CamundaImmutables() {
    // do not instantiate
  }

}

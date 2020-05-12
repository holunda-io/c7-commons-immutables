package io.holunda.commons.immutables;

import static io.holunda.commons.immutables.CamundaImmutablesTest.uuid;
import static io.holunda.commons.immutables.JacksonHelper.jsonMapper;
import static org.assertj.core.api.Assertions.assertThat;

import io.holunda.commons.immutables.CamundaImmutablesTest.BasicImmutableTest;
import io.holunda.commons.immutables.JacksonHelper.JsonMapper;
import java.util.Date;
import org.junit.Test;

public class EventSubscriptionTest implements BasicImmutableTest {

  private final JsonMapper<ImmutableEventSubscription> mapper = jsonMapper(ImmutableEventSubscription.class);

  @Test
  @Override
  public void create_minimal_dto() {
    ImmutableEventSubscription.builder()
      .id(uuid())
      .eventType("xxx")
      .eventName("event")
      .executionId(uuid())
      .processInstanceId(uuid())
      .activityId("activity")
      .build();
  }

  @Test
  @Override
  public void convert_json() {
    ImmutableEventSubscription dto = ImmutableEventSubscription.builder()
      .id(uuid())
      .eventType("xxx")
      .eventName("event")
      .executionId(uuid())
      .processInstanceId(uuid())
      .activityId("activity")
      .created(new Date())
      .build();

    String json = mapper.toJson(dto);
    assertThat(mapper.fromJson(json)).isEqualTo(dto);
  }
}

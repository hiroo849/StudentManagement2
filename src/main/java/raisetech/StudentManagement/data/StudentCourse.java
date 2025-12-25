package raisetech.StudentManagement.data;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "受講生コース詳細")
@Getter
@Setter
public class StudentCourse {

  @NotBlank
  @Pattern(regexp = "^\\d+$")
  private String id;

  @NotBlank
  @Pattern(regexp = "^\\d+$")
  private String studentId;

  @NotBlank
  @Pattern(regexp = "^\\d+$")
  private String courseName;

  private LocalDateTime startDate;
  private LocalDateTime endDate;
}

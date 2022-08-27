package coLaon.ClaonBack.center.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CenterReportCreateRequestDto {
    @NotBlank(message = "요청 내용을 입력해주세요.")
    private String content;
    @NotBlank(message = "요청 부분을 입력해주세요.")
    private String reportType;
}

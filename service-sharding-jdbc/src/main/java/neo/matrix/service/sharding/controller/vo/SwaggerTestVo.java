package neo.matrix.service.sharding.controller.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Swagger test vo")
public class SwaggerTestVo {

    @Schema(description = "Swagger test field")
    private String test;
}

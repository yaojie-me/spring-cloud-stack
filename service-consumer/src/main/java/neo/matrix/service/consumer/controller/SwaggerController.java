package neo.matrix.service.consumer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import neo.matrix.service.consumer.controller.vo.SwaggerTestVo;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "swagger3 文档示例")
@RestController
@RequestMapping("/swagger/api")
public class SwaggerController {

    @Operation(summary = "这个是一个 get 方法")
    @GetMapping("hello")
    public String hello(@Param(value = "name") @Parameter(description = "名称") String name) {
        return "I am user";
    }

    @Operation(summary = "这个是一个 get 方法,不显示", hidden = true)
    @GetMapping("hello2")
    public String hello2(@Param(value = "name") @Parameter(description = "名称") String name) {
        return "I am user";
    }

    @Operation(summary = "这个是一个 get 方法,不显示", hidden = true)
    @GetMapping("hello3")
    public String hello3(@RequestBody SwaggerTestVo t) {
        return "I am user";
    }
}

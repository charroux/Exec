package exec.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import exec.dto.CodeDTO;

@Component
@Controller
@RequestMapping("/exec")
public class ExecutorServiceImpl implements ExecutorService{

	List<CodeDTO> codes;
	
	public ExecutorServiceImpl(){
		codes = new ArrayList<CodeDTO>();
		CodeDTO code = new CodeDTO();
		code.setComment("A comment");
		code.setId(1);
		codes.add(code );
	}
	
	@Override
	@RequestMapping(value = "/code", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<CodeDTO> getCodes() {
		return codes;
	}

	@Override
	@RequestMapping(value = "/code/{codeId}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public CodeDTO getCode(long codeId) throws Exception {
		return codes.get(0);
	}

}

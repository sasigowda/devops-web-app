package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/devops")
public class DevOpsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("    <title>DevOps - CI/CD & Tools</title>");
            out.println("    <style>");
            out.println("        * { margin: 0; padding: 0; box-sizing: border-box; }");
            out.println("        body {");
            out.println("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
            out.println("            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);");
            out.println("            min-height: 100vh;");
            out.println("        }");
            out.println("        .navbar {");
            out.println("            background: rgba(255,255,255,0.95);");
            out.println("            padding: 1rem 2rem;");
            out.println("            box-shadow: 0 2px 10px rgba(0,0,0,0.1);");
            out.println("            display: flex;");
            out.println("            justify-content: space-between;");
            out.println("            align-items: center;");
            out.println("            position: sticky;");
            out.println("            top: 0;");
            out.println("            z-index: 1000;");
            out.println("        }");
            out.println("        .logo {");
            out.println("            font-size: 1.5rem;");
            out.println("            font-weight: bold;");
            out.println("            background: linear-gradient(135deg, #667eea, #764ba2);");
            out.println("            -webkit-background-clip: text;");
            out.println("            -webkit-text-fill-color: transparent;");
            out.println("        }");
            out.println("        .nav-menu { display: flex; list-style: none; gap: 1rem; }");
            out.println("        .nav-menu a {");
            out.println("            text-decoration: none;");
            out.println("            color: #333;");
            out.println("            font-weight: 500;");
            out.println("            padding: 0.5rem 1rem;");
            out.println("            border-radius: 5px;");
            out.println("            transition: all 0.3s;");
            out.println("        }");
            out.println("        .nav-menu a:hover {");
            out.println("            color: #667eea;");
            out.println("            background: #f0f0f0;");
            out.println("            transform: translateY(-2px);");
            out.println("        }");
            out.println("        .container { max-width: 1200px; margin: 2rem auto; padding: 2rem; }");
            out.println("        .hero-section {");
            out.println("            background: linear-gradient(135deg, #667eea, #764ba2);");
            out.println("            border-radius: 20px;");
            out.println("            padding: 3rem;");
            out.println("            text-align: center;");
            out.println("            color: white;");
            out.println("            margin-bottom: 2rem;");
            out.println("            animation: slideDown 0.8s ease-out;");
            out.println("        }");
            out.println("        .card {");
            out.println("            background: white;");
            out.println("            border-radius: 15px;");
            out.println("            padding: 2rem;");
            out.println("            margin-bottom: 2rem;");
            out.println("            box-shadow: 0 10px 30px rgba(0,0,0,0.1);");
            out.println("            transition: transform 0.3s;");
            out.println("            animation: fadeInUp 0.6s ease-out;");
            out.println("        }");
            out.println("        .card:hover { transform: translateY(-5px); }");
            out.println("        .pipeline-container {");
            out.println("            display: flex;");
            out.println("            justify-content: space-between;");
            out.println("            flex-wrap: wrap;");
            out.println("            gap: 1rem;");
            out.println("            margin-top: 2rem;");
            out.println("        }");
            out.println("        .pipeline-step {");
            out.println("            flex: 1;");
            out.println("            text-align: center;");
            out.println("            padding: 1rem;");
            out.println("            background: linear-gradient(135deg, #f5f7fa, #c3cfe2);");
            out.println("            border-radius: 10px;");
            out.println("            transition: transform 0.3s;");
            out.println("        }");
            out.println("        .pipeline-step:hover { transform: scale(1.05); }");
            out.println("        .step-number {");
            out.println("            width: 40px;");
            out.println("            height: 40px;");
            out.println("            background: #667eea;");
            out.println("            color: white;");
            out.println("            border-radius: 50%;");
            out.println("            display: flex;");
            out.println("            align-items: center;");
            out.println("            justify-content: center;");
            out.println("            margin: 0 auto 1rem;");
            out.println("            font-weight: bold;");
            out.println("        }");
            out.println("        .tools-grid {");
            out.println("            display: grid;");
            out.println("            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));");
            out.println("            gap: 1.5rem;");
            out.println("            margin-top: 1rem;");
            out.println("        }");
            out.println("        .tool-card {");
            out.println("            background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%);");
            out.println("            padding: 1.5rem;");
            out.println("            border-radius: 10px;");
            out.println("            border-left: 4px solid #667eea;");
            out.println("            transition: all 0.3s;");
            out.println("        }");
            out.println("        .tool-card:hover {");
            out.println("            transform: translateX(10px);");
            out.println("            box-shadow: 0 5px 15px rgba(0,0,0,0.1);");
            out.println("        }");
            out.println("        .metric-bar {");
            out.println("            width: 100%;");
            out.println("            height: 35px;");
            out.println("            background: #e0e0e0;");
            out.println("            border-radius: 17px;");
            out.println("            overflow: hidden;");
            out.println("            margin: 10px 0;");
            out.println("        }");
            out.println("        .metric-fill {");
            out.println("            height: 100%;");
            out.println("            background: linear-gradient(90deg, #667eea, #764ba2);");
            out.println("            color: white;");
            out.println("            line-height: 35px;");
            out.println("            padding-left: 15px;");
            out.println("            animation: slideIn 1s ease-out;");
            out.println("        }");
            out.println("        @keyframes slideDown {");
            out.println("            from { opacity: 0; transform: translateY(-30px); }");
            out.println("            to { opacity: 1; transform: translateY(0); }");
            out.println("        }");
            out.println("        @keyframes fadeInUp {");
            out.println("            from { opacity: 0; transform: translateY(20px); }");
            out.println("            to { opacity: 1; transform: translateY(0); }");
            out.println("        }");
            out.println("        @keyframes slideIn {");
            out.println("            from { width: 0; }");
            out.println("            to { width: var(--width); }");
            out.println("        }");
            out.println("        @media (max-width: 768px) {");
            out.println("            .pipeline-container { flex-direction: column; }");
            out.println("        }");
            out.println("    </style>");
            out.println("</head>");
            out.println("<body>");
            
            // Navigation
            out.println("    <nav class=\"navbar\">");
            out.println("        <div class=\"logo\">🚀 DevOps Dashboard</div>");
            out.println("        <ul class=\"nav-menu\">");
            out.println("            <li><a href=\"index.html\">🏠 Home</a></li>");
            out.println("            <li><a href=\"devops\" style=\"background:#667eea; color:white;\">⚙️ DevOps</a></li>");
            out.println("            <li><a href=\"hello\">📊 Dashboard</a></li>");
            out.println("            <li><a href=\"aws\">☁️ AWS</a></li>");
            out.println("        </ul>");
            out.println("    </nav>");
            
            out.println("    <div class=\"container\">");
            
            // Hero Section
            out.println("        <div class=\"hero-section\">");
            out.println("            <h1>⚙️ DevOps Engineering</h1>");
            out.println("            <p>Bridging the gap between development and operations with automation</p>");
            out.println("        </div>");
            
            // CI/CD Pipeline
            out.println("        <div class=\"card\">");
            out.println("            <h2 style=\"color:#667eea;\">🔄 CI/CD Pipeline</h2>");
            out.println("            <div class=\"pipeline-container\">");
            out.println("                <div class=\"pipeline-step\"><div class=\"step-number\">1</div><h3>Code</h3><p>Git/GitHub</p></div>");
            out.println("                <div class=\"pipeline-step\"><div class=\"step-number\">2</div><h3>Build</h3><p>Maven/Gradle</p></div>");
            out.println("                <div class=\"pipeline-step\"><div class=\"step-number\">3</div><h3>Test</h3><p>JUnit/TestNG</p></div>");
            out.println("                <div class=\"pipeline-step\"><div class=\"step-number\">4</div><h3>Package</h3><p>Docker/WAR</p></div>");
            out.println("                <div class=\"pipeline-step\"><div class=\"step-number\">5</div><h3>Deploy</h3><p>K8s/Tomcat</p></div>");
            out.println("                <div class=\"pipeline-step\"><div class=\"step-number\">6</div><h3>Monitor</h3><p>Prometheus</p></div>");
            out.println("            </div>");
            out.println("        </div>");
            
            // Tools
            out.println("        <div class=\"card\">");
            out.println("            <h2 style=\"color:#667eea;\">🛠️ DevOps Tools & Technologies</h2>");
            out.println("            <div class=\"tools-grid\">");
            out.println("                <div class=\"tool-card\"><h3>📦 Version Control</h3><p>Git, GitHub, GitLab, Bitbucket</p></div>");
            out.println("                <div class=\"tool-card\"><h3>🏗️ CI/CD Tools</h3><p>Jenkins, GitLab CI, GitHub Actions, ArgoCD</p></div>");
            out.println("                <div class=\"tool-card\"><h3>🐳 Containerization</h3><p>Docker, Podman, Container Registry</p></div>");
            out.println("                <div class=\"tool-card\"><h3>☸️ Orchestration</h3><p>Kubernetes, OpenShift, EKS, AKS</p></div>");
            out.println("                <div class=\"tool-card\"><h3>📊 Monitoring</h3><p>Prometheus, Grafana, ELK Stack, Datadog</p></div>");
            out.println("                <div class=\"tool-card\"><h3>🔧 Infrastructure as Code</h3><p>Terraform, Ansible, Pulumi, CloudFormation</p></div>");
            out.println("            </div>");
            out.println("        </div>");
            
            // Key Metrics
            out.println("        <div class=\"card\">");
            out.println("            <h2 style=\"color:#667eea;\">📈 Key DevOps Metrics</h2>");
            out.println("            <div class=\"tools-grid\">");
            out.println("                <div class=\"tool-card\"><h3>⚡ Deployment Frequency</h3><p style=\"font-size:1.5rem; font-weight:bold; color:#667eea;\">15x/day</p><p>Multiple deployments per day</p></div>");
            out.println("                <div class=\"tool-card\"><h3>⏱️ Lead Time</h3><p style=\"font-size:1.5rem; font-weight:bold; color:#667eea;\">&lt;1 hour</p><p>From commit to production</p></div>");
            out.println("                <div class=\"tool-card\"><h3>🔄 MTTR</h3><p style=\"font-size:1.5rem; font-weight:bold; color:#667eea;\">&lt;30 min</p><p>Mean Time to Recovery</p></div>");
            out.println("                <div class=\"tool-card\"><h3>✅ Change Failure Rate</h3><p style=\"font-size:1.5rem; font-weight:bold; color:#667eea;\">2-5%</p><p>Deployment success rate</p></div>");
            out.println("            </div>");
            out.println("            <div class=\"metric-bar\"><div class=\"metric-fill\" style=\"width:94%;\">Build Success: 94%</div></div>");
            out.println("            <div class=\"metric-bar\"><div class=\"metric-fill\" style=\"width:87%;\">Test Coverage: 87%</div></div>");
            out.println("            <div class=\"metric-bar\"><div class=\"metric-fill\" style=\"width:99.9%;\">Uptime: 99.9%</div></div>");
            out.println("        </div>");
            
            out.println("    </div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

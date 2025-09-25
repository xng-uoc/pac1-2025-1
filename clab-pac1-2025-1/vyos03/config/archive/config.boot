interfaces {
    dummy dum0 {
        address "3.3.3.3/32"
    }
    ethernet eth0 {
        address "172.20.20.43/24"
        address "3fff:172:20:20::4/64"
        address "3fff:172:20:20::8/64"
        description "Management Interface"
    }
    ethernet eth1 {
        address "10.2.3.2/30"
    }
    ethernet eth2 {
        address "10.1.3.2/30"
    }
    ethernet eth3 {
        address "192.168.3.1/24"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjUyMDA4MThaFw0yNjA5MjUyMDA4MThaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJwYWMxLTIwMjUtMSBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCrv6i5reawKIqp5r8rUNjLhYatvJCfwd+yOLW01efHF/oyRizfL6Udcxjcz+r5o10oZJp5hlpIbGzSmqIfWrfO7aszMH2gq+Rm42CqxqSFkUs56/AtjvjtW7S2OVT+0kLQwLmXRgNnt3uaaiP6BuvFnjgu3HOtjrq6gHuyEipBs/AahrorUZxqXdLxwql35IZFl59UKU2RFs0rX24FUdi2AXmO/k9pH/DBonWKG1rDj+aNZJ7rbjSN+PxHGCi4sOLOF3RkE6pRUOUVij5BW8ndLFt1jpswyVh4pF2WNG1kDRsCBL0UDEemjibd06GHhyTfrtML6EY/ia87EnVZt3qBAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUJ3mIpml0XzfYcX0ecIFeZh1FBjMwDQYJKoZIhvcNAQELBQADggEBAE0lDl6v1xbG+SAW2ArI6r4STeiqga9ZyLXZ1Cu65i5BLyspKN+Gx9kw+4Ry3y+JNaEzovHhIOzAfuc43FgRoLxX0AmhJed81tulYKNbDgo30Xit8gGMDN95xhr3cTt4/kKPP2wIHCXd4xm+mEmpy+GwaKxaUMeFbidzbgVsMijrEcB0ACflLk72mmfxPzRbxVTVnAwrSzoL8cf7tljsk64ihC6BJHHHXy9cgxGCf8RAMoNW3GuEh8y03vbKkbEP1uucWUSzeAbF9iMrzvCv5bcn9rCQtILvIUrMNTcmaP84/Y83LuWuZWb7GgiX7tGU4LYweuYhZCRupyOnwQtaDKk="
    }
    certificate self {
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzEtMjAyNS0xIGxhYiBDQTAeFw0yNTA5MjUyMDA4MThaFw0yNjA5MjUyMDA4MThaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDMucGFjMS0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQC+xEKOB9KOilBM/7pNYcnTyKuVNLXupDYDrs8Ct9YFwEX/mOLRFYGftv0d50yHayWN/FHewPrIlQnYqrqLNa37hF80qBoYbnGn3OhNi+P9AOZ3IXRg1sPNM7AZ8kPgtZWdCOIUWak3XbFxmK0fB3CRvVBo0pX8VNCywdFkKJ36VT/tyx/qJ+xAFQ9zRocgcmC1ElopAeBJ75rfvQU4DLHFlu2FCjiWTmij1pGplQzBinjiZuyW7pFiXw3g7TpQ+gBhKyEQl8t+ZQJ80PIMbz7B6cnYNUPw2j0hnsU0XzQTmM8fwn5Fl2WffKUlsM9JZrMzijPdzUfRAyZAv8vjEh4XAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUJ3mIpml0XzfYcX0ecIFeZh1FBjMwRwYDVR0RBEAwPoIGdnlvczAzghdjbGFiLXBhYzEtMjAyNS0xLXZ5b3MwM4IVdnlvczAzLnBhYzEtMjAyNS0xLmlvhwSsFBQrMA0GCSqGSIb3DQEBCwUAA4IBAQAWA3UZO0PxR+16V4CqFzz+RFY2KOABQGxSycN5KP1Kxp3U9no+N6F+kUNBzHRepVIW+4PhmjA2QuIB8g4q2UPv+udZK0PgeDhWBeHuetXGZk47FGVvj+/erptBgHJD11eKavcL22OwaKx72shzIf/ufoS/YwD+yLxZIAPVMFYiN6lvpYAQ3tAIJfbfCKirbtwBCO8by+KOjYh4EKHF4VYqiaI/Z5112bksJqygEv+hQeTWG5mu9UFOhOGZCyhGPmAmjkVO0uZwsHO/MJ0aa87NbtA1+BREppIG9EPkI4f2zNyc3ch9iRNacDJrh5umXgrbNDivl7L06N2RUBdwdBjT"
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC+xEKOB9KOilBM/7pNYcnTyKuVNLXupDYDrs8Ct9YFwEX/mOLRFYGftv0d50yHayWN/FHewPrIlQnYqrqLNa37hF80qBoYbnGn3OhNi+P9AOZ3IXRg1sPNM7AZ8kPgtZWdCOIUWak3XbFxmK0fB3CRvVBo0pX8VNCywdFkKJ36VT/tyx/qJ+xAFQ9zRocgcmC1ElopAeBJ75rfvQU4DLHFlu2FCjiWTmij1pGplQzBinjiZuyW7pFiXw3g7TpQ+gBhKyEQl8t+ZQJ80PIMbz7B6cnYNUPw2j0hnsU0XzQTmM8fwn5Fl2WffKUlsM9JZrMzijPdzUfRAyZAv8vjEh4XAgMBAAECggEARVoRPhRO8l4LQmrnvnESECnQYx52E6tkLaOUA490wcN8Tyc0MkHozXkXfRMVCdgkn4E+/EXZBinUmg27YpehyCIAAKMqVX51WErhsytrt5NntaCWcAwzw7qKR2yBS8SH/z52/mH4ODYaJ8uTCIhKXtldzbXdLA5jjtESgCCaCiLpMY2Y1sPbdV6f3LYfeYwkteLRIdk7CAGLqS31dyuq4JjPMgdMk9gFbsPVfYujQW1aM+l5234e6XpHyMMEUBlwzVQLfYHXxdoMUTpeLlkrhnEa96nc4w3ONn1an03ZH6E0eqNMBJwWqLMbcTBnwRqCKOEOXnEuzIbayK8IS40iQQKBgQD3nwF3Fn/s6x6RV6KPycE8q9z/W7BweOIP/tx8g0MvOOwBanQ7Zr3PobWU6gjKS8VF2t0pKXZ7JPg3kY7ne+LLETiI9cqHAAkzzBVNfv59JDjWnPgKd5yhhLmaRbD+cHhhmUR10KT9E23nLPAqiugL6OcSI1ANefGoe995jLuqQQKBgQDFOMH+hfmEBbE5TNMuoSbu4ZTSbAfn9lpE7Wubjnmktw8ppBkIBTfzQDAaO7U7TEXURg9mGUSM7l3IJz/h/UYAvDKaUqvQ5ie8fxhuLnlm4AG0HRXyRi3ph+pO0XiawxVhio5mqwu4YLcyhypk9SPRz1VEV8P2sEv6KpwiqsbCVwKBgE2P0LWspoVfYEPGX3UKjSyj6KVT4wBX3PeFrSqTMwgnnEUVQzMYC3xt+qKabAZxlWk8FOo/wozwF4/QWCLJ+1AAJOVBmB6RNFC1LDcKAEzSe7s9j7Q3oyg0mq5oBfis4ggwKfF9WTCsVVCEEvZAbE7OtRJJXVnbSIatxmIcYuwBAoGAMCABdpJKqKSa8liEz8QTNAdnwVELPNcof9lPgM3rcP4afRbF5OchGAJ5um0HdEjQYVQXPdq8l4cy6zxookSjaFqEHpQ9yOPgnmaFF53PkgLnZ4QRbuUhHvNDgagrvdgMx5h/1x215m/zRCkndys6amAldl/UOcYbRBhRsUPq7FECgYEAnUyP4JhmSnmmIsgWCE5qwh/bn5uF9nMNLx+UCfaJXXSX2mHfVSRt+iVATeQHzmFXXJvj4+dveyU4u5ERpJ0d+bPQ1CCtLyEANadDnc+MZfYUaseDbWjWtkIBeMQSfTXMc+2uuApNnMkRWFr9K7c7U3/OqtCtVyumbNDvz9N+ghY="
        }
    }
}
protocols {
    ospf {
        area 0 {
            network "10.1.3.0/30"
            network "10.2.3.0/30"
            network "192.168.3.0/24"
            network "3.3.3.3/32"
        }
        interface dum0 {
            passive {
            }
        }
        interface eth1 {
            network "point-to-point"
        }
        interface eth2 {
            network "point-to-point"
        }
        interface eth3 {
            passive {
            }
        }
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "vyos03"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$5CHINZdMtMirdtYU$dFfCKu1RdqBvcYFrGwYlol50vV/ydTgpycUpvuWt4YMV4W7vLLOMv7DcJY5zdT6V9S8VYYqP9ecD9OijSw/jt."
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAABgQCqnzaeMn5uFxEAkG917XwNy+xwwZlsUy86pLZzgXMyO7X3EVIyEv6/LbgR9mXYZOtzDJHPecVi5H+lSy2jFGwXaacGAhcjg3XQQevKoaBW2g45WI38Bjnxm8hACRo/5aoY80ResYIOdtvAoLiUOGe9x74lUsUVT7iv9DSuyMlVI6CeZkqzcMaAu7fKSfIvl40YmgW1lC3OKANGIT5LLL6310PfuBZsQHh2Ye/F2q3bOgL8NSJ/dp7Ml6mvLLwyCwqHlxATWB7V2vUHOokEKo15HOqC/maugeht486b1gEKrMpL1oZsBrEBAs5MkHfYGNqfmY07crI83F2VnF6N4/ez8eP8EJoBj/99rZMX6Ish04Bw8MmTfppBZKrhaVFGNq9e6YSgjd6mFNmZkX/GO89CSd9TCFMdqYJYyc+3YmnHRL4AWgO/er9Ja/K2X6R6Dw2lo4PXRWfyspN7HAhZkZV2c1Uaxx3MyOC1fmvzou7b3uBEEpb40lOijEGVL7q2780="
                    type "ssh-rsa"
                }
            }
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@19:flow-accounting@1:https@7:ids@1:interfaces@33:ipoe-server@4:ipsec@13:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@8:pppoe-server@11:pptp@5:qos@2:quagga@11:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@29:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 1.5-stream-2025-Q2
